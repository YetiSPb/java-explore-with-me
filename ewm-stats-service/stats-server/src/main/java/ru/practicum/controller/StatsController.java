package ru.practicum.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import ru.practicum.EndpointHitDto;
import ru.practicum.ViewStatsDto;
import ru.practicum.service.StatsService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class StatsController {

    private final StatsService service;

    @Autowired
    public StatsController(StatsService service) {
        this.service = service;
    }

    @PostMapping("/hit")
    public void addHit(@RequestBody EndpointHitDto dto) {
        log.info("Received a POST request to create a hit of {}", dto.toString());
        service.addHit(dto);
    }

    @GetMapping("/stats")
    public List<ViewStatsDto> searchStats(@RequestParam(defaultValue = "false") boolean unique,
                                          @RequestParam(name = "start") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                                          LocalDateTime start,
                                          @RequestParam(name = "end") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                                          LocalDateTime end,
                                          @RequestParam(required = false) List<String> uris) {
        log.info("Received a GET request to find stats with unique={}, start={}, end={}, uris={}", unique,
                start.toString(), end.toString(), uris);
        List<String> urisList = uris != null ? uris : new ArrayList<>();
        return service.searchStats(start, end, urisList, unique);
    }

}
