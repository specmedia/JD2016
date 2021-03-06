package by.it.sinkevich.jd02_09.TaskB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Class for jd02_09 taskB. Making beans to Test JAXB
 *
 * @author Sinkevich Denis
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Horse", propOrder = {
        "name",
        "odds"
})
public class Horse {

    public Horse() {
    }

    public Horse(String name, float odds) {
        this.name = name;
        this.odds = odds;
    }

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Odds", required = true)
    protected float odds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getOdds() {
        return odds;
    }

    public void setOdds(float odds) {
        this.odds = odds;
    }
}
