package model;

public class QuestStep {
    private String id;
    private String nextStep1id;
    private String nextStep2id;
    private String text;
    private String option1;
    private String option2;

    public QuestStep(String id, String nextStep1id, String option1, String nextStep2id, String option2, String text) {
        this.id = id;
        this.nextStep1id = nextStep1id;
        this.nextStep2id = nextStep2id;
        this.text = text;
        this.option1 = option1;
        this.option2 = option2;
    }

    //TODO: for test only, redo
    public QuestStep(String id) {
        this.id = id;
        this.nextStep1id = id;
        this.nextStep2id = id;
        this.text = "Common text";

    }

    //TODO: for test only, redo
    public QuestStep(String id, String text) {
        this.id = id;
        this.nextStep1id = null;
        this.nextStep2id = null;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNextStep2id() {
        return nextStep2id;
    }

    public void setNextStep2id(String nextStep2id) {
        this.nextStep2id = nextStep2id;
    }

    public String getNextStep1id() {
        return nextStep1id;
    }

    public void setNextStep1id(String nextStep1id) {
        this.nextStep1id = nextStep1id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }
}
