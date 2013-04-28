package crystal.trampoline.biz.sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SampleServiceImpl implements SampleService {

    private static final List<String> FORTUNES = buildFortunes();

    private static List<String> buildFortunes() {
        List<String> fortuneSet = Arrays.asList(
                "Hey! I'm just a simple sample service talking to you!",
                "I hope I'm useful to you",
                "I guess you could just remove me and implement something great instead",
                "I believe in you ;)");

        return Collections.unmodifiableList(fortuneSet);
    }

    @Override
    public String tellFortune() {
        Random r = new Random();
        return FORTUNES.get(r.nextInt(FORTUNES.size()));
    }
}
