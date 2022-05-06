package bg.softuni.pathfinder.web;

import bg.softuni.pathfinder.model.service.RouteServiceModel;
import bg.softuni.pathfinder.model.view.RouteMiniViewModel;
import bg.softuni.pathfinder.service.RouteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/routes")
public class RouteController {

    private final RouteService routesService;
    private final ModelMapper modelMapper;

    @Autowired
    public RouteController(RouteService routesService, ModelMapper modelMapper) {
        this.routesService = routesService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/all")
    public String getAllRoutes(Model model) {

        List<RouteServiceModel> allRoutes = this.routesService.getAllRoutes();
        model.addAttribute("routeViews", allRoutes
                .stream()
                .map(r -> this.modelMapper.map(r, RouteMiniViewModel.class))
                .collect(Collectors.toList()));

        return "routes";
    }
}
