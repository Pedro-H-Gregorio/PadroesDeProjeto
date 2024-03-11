package topic5and8and9;

import topicthree.Name;

public class BasicData {
    // I will use Name from topic 3
    Name name;
    Age age;
    public BasicData(String name, int age) {
        this.name = new Name(name);

        // this goes against the rule 3, but i will not make the class for this
        this.age = new Age(age);
    }
}
