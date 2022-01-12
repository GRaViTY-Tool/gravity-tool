package dummy;

import org.gravity.security.annotations.requirements.Critical;

@Critical(high = {}, integrity = {}, secrecy = { "method():void" })
public class Test {
}
