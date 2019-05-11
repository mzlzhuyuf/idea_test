package cn.zhuyuf.idealession.domain;

/**
 * @author Hero
 * @description cn.zhuyuf.idealession.domain
 * @date 2019/5/11
 */
public class Customer {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
