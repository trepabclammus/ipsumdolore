import java.util.ArrayList;
import java.util.List;

class Target {
    // Target class implementation
}

class Source {
    private List<Target> targetList = new ArrayList<>();

    public List<Target> targets() {
        return targetList;
    }
}

public class Main {
    public static void main(String[] args) {
        Source source = new Source();
        Target target = new Target();
        
        source.targets().add(target);
        
        // Now the target is added to the source's target list.
    }
}
