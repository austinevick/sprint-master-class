package com.example.springmasterclass.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public record ApiException(String message, HttpStatus status, ZonedDateTime dateTime) {
}
