package dummy;

import org.gravity.security.annotations.requirements.Critical;

@Critical(integrity = {}, high = {}, secrecy = { "method():void" })
public class Test {
}
