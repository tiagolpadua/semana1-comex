package br.com.comex.core.exceptions;

public class EntidadeNaoEncontradaException extends Exception {
  public EntidadeNaoEncontradaException(String message) {
    super(message);
  }

  public EntidadeNaoEncontradaException(String message, Throwable cause) {
    super(message, cause);
  }
}
