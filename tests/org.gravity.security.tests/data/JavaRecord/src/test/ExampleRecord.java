package test;

import org.gravity.security.annotations.requirements.Critical;

@Critical(secrecy = {"secret:String"}, integrity = {"secret:String"})
public record ExampleRecord(String secret, int foo) {
}
