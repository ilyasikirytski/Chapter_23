package tasks.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Facade {
    List<Transport> transports = new ArrayList<>();

    public Facade(Transport... transports) {
        this.transports.addAll(Arrays.asList(transports));
    }

    public void sendTransportOrder(int tripLength) {
        for (Transport transport : this.transports) {
            System.out.println(transport.getCostOfShipping(tripLength));
        }
    }
}
