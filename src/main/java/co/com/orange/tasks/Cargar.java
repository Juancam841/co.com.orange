package co.com.orange.tasks;

import co.com.orange.model.TestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Cargar implements Task {
private final Map<String, String> data;

    public Cargar(Map<String, String> data) {
        this.data = data;
    }

    public static Cargar datos(Map<String, String> data) {
        return Tasks.instrumented(Cargar.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Set<Map.Entry<String, String>> datosAux = data.entrySet();
        TestData.setData(datosAux.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }

}
