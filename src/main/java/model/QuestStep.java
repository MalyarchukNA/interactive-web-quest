package model;

public class QuestStep {
    private String id;
    private String nextStep1id;
    private String nextStep2id;
    private String nextStepText1id;
    private String nextStepText2id;
    private String text;
    private String option1;
    private String option2;
    private String prevText;    //Текст, в зависимости от выбора на предыдущем слайде
    private Integer fragment1id;
    private Integer fragment2id;
    private Integer lucidity1id;
    private Integer lucidity2id;

    public String getPrevText() {
        return prevText;
    }

    public void setPrevText(String prevText) {
        this.prevText = prevText;
    }

    public QuestStep(String id, String nextStep1id, String option1, Integer fragment1id, Integer lucidity1id, String nextStepText1id, String nextStep2id, String option2, Integer fragment2id, Integer lucidity2id, String nextStepText2id, String text) {
        this.id = id;
        this.nextStep1id = nextStep1id;
        this.nextStep2id = nextStep2id;
        this.text = text;
        this.option1 = option1;
        this.option2 = option2;
        this.nextStepText1id = nextStepText1id;
        this.nextStepText2id = nextStepText2id;
        this.fragment1id = fragment1id;
        this.fragment2id = fragment2id;
        this.lucidity1id = lucidity1id;
        this.lucidity2id = lucidity2id;
    }

    //For finals
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

    public String getNextStepText1id() {
        return nextStepText1id;
    }

    public void setNextStepText1id(String nextStepText1id) {
        this.nextStepText1id = nextStepText1id;
    }

    public String getNextStepText2id() {
        return nextStepText2id;
    }

    public void setNextStepText2id(String nextStepText2id) {
        this.nextStepText2id = nextStepText2id;
    }


    public Integer getLucidity2id() {
        return lucidity2id;
    }

    public void setLucidity2id(Integer lucidity2id) {
        this.lucidity2id = lucidity2id;
    }

    public Integer getLucidity1id() {
        return lucidity1id;
    }

    public void setLucidity1id(Integer lucidity1id) {
        this.lucidity1id = lucidity1id;
    }

    public Integer getFragment2id() {
        return fragment2id;
    }

    public void setFragment2id(Integer fragment2id) {
        this.fragment2id = fragment2id;
    }

    public Integer getFragment1id() {
        return fragment1id;
    }

    public void setFragment1id(Integer fragment1id) {
        this.fragment1id = fragment1id;
    }

}
