package lesson8.task_example_service;

public class Service {
    private String name;

    public Service(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void needToDoService(City city, Contract contract) {
        if (city.getDistance() > contract.getHuman().getAuto().getDistanceBeforeService()) {
            System.out.println("Уважаемый " + contract.getHuman().getName() + ".\n" +
                    " Прежде чем вы направитесь в " + city.getName() + " вам понадобится пройти ТО.");
        } else {
            System.out.println("Уважаемый " + contract.getHuman().getName() + ".\n" +
                    "   Езжайте в " + city.getName() + ". Но не забывайте, что согласно" +
                    " договору " + contract.getId() + " вы обслуживаетесь у нас.\n" +
                    "   Ваша \"" + name + "\".");
        }
    }
}
