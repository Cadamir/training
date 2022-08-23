package cad.trainingsws;

public class Komplex {
    public static String komplex(int a, String b, double c, Athlet athlet) {
        if(a > athlet.age) {
            return athlet.name + "is too young";
        }
        switch (b){
            case "name": {
                return athlet.name;
            }
            case "clubs": {
                StringBuilder sb = new StringBuilder();
                for(String club : athlet.clubs){
                    sb.append(club).append("\n");
                }
                return sb.toString();
            }
            case "achievement": {
                StringBuilder sb = new StringBuilder();
                for(String achievement : athlet.achievments){
                    sb.append(achievement).append("\n");
                }
                return sb.toString();
            }
            case "data": {
                return Double.toString(athlet.weight) + "-" + Integer.toString(athlet.age) + "-" + Integer.toString(athlet.height);
            }
            default: {
                if(athlet.weight < c) {
                    return "Gewicht von " + athlet.name + " passt";
                }
                else return athlet.name + " ist zu schwer für diese Gewichtsklasse";
            }
        }
    }
}
