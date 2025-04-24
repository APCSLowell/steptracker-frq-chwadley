import java.util.ArrayList;
public class StepTracker {
    private ArrayList<Integer> steps;
    private int minSteps,totalSteps,active;

    public StepTracker(int _ms) {
        minSteps = _ms;
        steps = new ArrayList<Integer>();
        totalSteps = 0;
        active = 0;
    }

    public void addDailySteps(int _s) {
        steps.add(_s);
        totalSteps+=_s;
        active+=_s>=minSteps?1:0;
    }

    public int activeDays() {
        return active;
    }

    public double averageSteps() {
        return (double)totalSteps/steps.size();
    }
} 
