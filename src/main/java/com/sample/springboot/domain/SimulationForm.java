package com.sample.springboot.domain;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class SimulationForm {

	private LocalDate referenceDate;
}