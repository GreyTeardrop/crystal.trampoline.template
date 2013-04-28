package crystal.trampoline.view.controller;

import crystal.trampoline.biz.sample.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

    private SampleService sampleService;

    @RequestMapping("/sample")
    public ModelAndView showSample() {
        ModelAndView mav = new ModelAndView("sample");
        mav.addObject("fortune", sampleService.tellFortune());
        return mav;
    }

    @Autowired
    public void setSampleService(SampleService sampleService) {
        this.sampleService = sampleService;
    }
}
