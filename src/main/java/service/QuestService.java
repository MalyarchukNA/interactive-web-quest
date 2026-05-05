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
                "step1", "Войти в кабину лифта.", "Вы экономите время, но шепот в замкнутом пространстве проникает прямо в разум.",
                "step2", "Подняться по лестнице.", "Путь утомителен, но спокойствие позволяет вам заметить детали. Вы поднимаете с пола медную монету с выгравированным глазом",
                     "«Ключ в ваших руках кажется неестественно холодным. Вы поворачиваетесь к лестничному пролету. Здесь отель разделяется.\n" +
                             "\n" +
                             "Слева — старый лифт с кованой решеткой. Из его шахты доносится едва уловимый шепот и запах озона. Кажется, он доставит вас наверх мгновенно, но цена может быть выше, чем просто время.\n" +
                             "\n" +
                             "Справа — винтовая лестница. Она уходит в густую тень. Ступени выглядят надежно, но путь предстоит долгий. В складках пыльного ковра на первой ступени что-то тускло блестит»."));
        steps.put("step1", new QuestStep("step1",
                "goodFinal", "good final text", "",
                "step2", "step 2 text", "",
                        "step1 header text"));
        steps.put("step2", new QuestStep("step2",
                "goodFinal", "good final text", "",
                "badFinal", "bad final text", "",
                "step 2 header text"));
        steps.put("goodFinal", new QuestStep("goodFinal", "Good final"));
        steps.put("badFinal", new QuestStep("badFinal", "Bad final"));

        steps.get("start").setPrevText("Вы только что оставили свое имя в книге. Раздается глухой удар колокольчика, хотя вы к нему не прикасались." +
                " Тяжелый железный ключ с номером «104» материализуется на стойке. Вы забираете его, и свет в холле тускнеет, оставляя освещенным только путь к подъему.");
    }

    public QuestStep getStep(String stepId){
        return steps.get(stepId);
    }

    public boolean isFinalStep(QuestStep step){
        return (step != null && step.getNextStep1id() == null);
    }
}
