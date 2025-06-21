import java.util.*;

public class State {
    private Map<Variable, Value> memory = new HashMap<>();

    public Value get(Variable v) {
        if (!memory.containsKey(v)) {
            throw new RuntimeException("Variable " + v + " is undefined.");
        }
        return memory.get(v);
    }

    public void put(Variable v, Value val) {
        memory.put(v, val);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Variable, Value> entry : memory.entrySet()) {
            sb.append(entry.getKey()).append(" = ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}