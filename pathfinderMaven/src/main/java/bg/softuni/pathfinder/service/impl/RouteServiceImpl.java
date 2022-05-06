package bg.softuni.pathfinder.service.impl;

import bg.softuni.pathfinder.model.service.RouteServiceModel;
import bg.softuni.pathfinder.repository.RouteRepository;
import bg.softuni.pathfinder.service.RouteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RouteServiceImpl implements RouteService {
    private final RouteRepository routeRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public RouteServiceImpl(RouteRepository routeRepository, ModelMapper modelMapper) {
        this.routeRepository = routeRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<RouteServiceModel> getAllRoutes() {
        return this.routeRepository.findAll()
                .stream()
                .map(routeEntity -> this.modelMapper.map(routeEntity, RouteServiceModel.class))
                .collect(Collectors.toList());
    }
}
