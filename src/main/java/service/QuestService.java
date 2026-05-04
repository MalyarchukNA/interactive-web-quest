package service;

import model.QuestStep;

import java.util.HashMap;

public class QuestService {
    private final HashMap<String, QuestStep> steps = new HashMap<>();

    public QuestService(){
        stepsInit();
    }

    private void stepsInit(){
        steps.put("start", new QuestStep("start",
                "step1", "Option1 text",
                "step2", "Option2 text",
                     "Start header text"));
        steps.put("step1", new QuestStep("step1",
                "goodFinal", "good final text", "step2", "step 2 text",
                        "step1 header text"));
        steps.put("step2", new QuestStep("step2",
                "goodFinal", "good final text",
                "badFinal", "bad final text",
                "step 2 header text"));
        steps.put("goodFinal", new QuestStep("goodFinal", "Good final"));
        steps.put("badFinal", new QuestStep("badFinal", "Bad final"));
    }

    public QuestStep getStep(String stepId){
        return steps.get(stepId);
    }

    public boolean isFinalStep(QuestStep step){
        return (step != null && step.getNextStep1id() == null);
    }
}
