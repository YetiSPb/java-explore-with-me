package ru.practicum.service;

import org.springframework.data.domain.Pageable;
import ru.practicum.dto.CompilationDto;
import ru.practicum.dto.UpdateCompilationDto;

import java.util.List;

public interface CompilationService {
    List<CompilationDto> searchCompilations(Boolean pinned, Pageable page);

    CompilationDto searchById(Long compId);

    CompilationDto addCompilation(UpdateCompilationDto dto);

    void deleteCompilation(Long compId);

    CompilationDto patchCompilation(Long compId, UpdateCompilationDto update);

}
