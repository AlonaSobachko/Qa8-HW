package hw7;

public class Synopsis {
    //Створити клас Конспект. Клас повинен містити такі поля:
    // • ПІБ студента;
    // • Назва предмету;
    // • Кількість сторінок;
    // • Рік випуску;
    // • Колір обкладинки.
    // • Назва закладу, де навчається студент;

    private String fullName;
    private String subjectName;
    private int countOfPage;
    private int graduationYear;
    private String colorOfCover;
    private String nameOfTheInstitution;

    public Synopsis (String fullName, String subjectName, int countOfPage, int graduationYear,
                          String colorOfCover, String nameOfTheInstitution){
        this.fullName = fullName;
        this.subjectName = subjectName;
        this.countOfPage = countOfPage;
        this.graduationYear = graduationYear;
        this.colorOfCover = colorOfCover;
        this.nameOfTheInstitution = nameOfTheInstitution;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getCountOfPage() {
        return countOfPage;
    }

    public void setCountOfPage(int countOfPage) {
        this.countOfPage = countOfPage;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getColorOfCover() {
        return colorOfCover;
    }

    public void setColorOfCover(String colorOfCover) {
        this.colorOfCover = colorOfCover;
    }

    public String getNameOfTheInstitution() {
        return nameOfTheInstitution;
    }

    public void setNameOfTheInstitution(String nameOfTheInstitution) {
        this.nameOfTheInstitution = nameOfTheInstitution;
    }
}
