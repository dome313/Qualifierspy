package se.lolotron.qualifierspy;

public class SimpleService {

  private String methodReturnValue;

  public SimpleService(String methodReturnValue) {
    this.methodReturnValue = methodReturnValue;
  }

  public String method() {
    return methodReturnValue;
  }


}
