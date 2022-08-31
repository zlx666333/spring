package zlx.bean;

import org.springframework.stereotype.Component;

@Component
public class Boss {
    //@Autowired
    private Car car;

    public Car getCar() {
        return car;
    }
    //@Autowired
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" + "car=" + car + '}';
    }
    public Boss(Car car){
        this.car=car;
    }
}
