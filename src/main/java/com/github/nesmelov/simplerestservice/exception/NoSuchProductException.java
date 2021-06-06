package com.github.nesmelov.simplerestservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoSuchProductException extends RuntimeException {

  public NoSuchProductException() {
    super();
  }

  public NoSuchProductException(String message) {
    super(message);
  }

  public NoSuchProductException(String message, Throwable cause) {
    super(message, cause);
  }

  public NoSuchProductException(Throwable cause) {
    super(cause);
  }

  protected NoSuchProductException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
