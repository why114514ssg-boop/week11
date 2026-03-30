import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Repository<T extends SoccerEntity> {

    protected List<T> items = new ArrayList<>();

    public List<T> getAll() {
        return items;
    }

    public void add(T item) {
        if (item != null) {
            items.add(item);
        }
    }

    public List<T> filter(Predicate<T> predicate) {
        return items.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
