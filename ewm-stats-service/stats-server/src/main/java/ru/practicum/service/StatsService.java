package ru.practicum.service;

import ru.practicum.EndpointHitDto;
import ru.practicum.ViewStatsDto;

import java.time.LocalDateTime;
import java.util.List;

public interface StatsService {
    EndpointHitDto addHit(EndpointHitDto dto);

    List<ViewStatsDto> searchStats(LocalDateTime start, LocalDateTime end, List<String> uris, boolean unique);

}
