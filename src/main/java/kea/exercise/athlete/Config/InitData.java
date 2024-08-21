package kea.exercise.athlete.Config;

import kea.exercise.athlete.Repositories.DisciplineRepository;
import kea.exercise.athlete.Repositories.ParticipantRepository;
import kea.exercise.athlete.Repositories.ResultRepository;
import kea.exercise.athlete.entities.Discipline;
import kea.exercise.athlete.entities.Participant;
import kea.exercise.athlete.entities.Result;
import kea.exercise.athlete.enums.DisciplinNameEnum;
import kea.exercise.athlete.enums.ParticipantAgeGroupEnum;
import kea.exercise.athlete.enums.ParticipantGenderEnum;
import kea.exercise.athlete.enums.ResultTypeEnum;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class InitData implements CommandLineRunner {

    @Override
    public void run(String... args) {
        createParticipants();
        createDisciplines();
        createResults();
        System.out.println("InitData has been created");
    }

    private final DisciplineRepository disciplineRepository;
    private final ParticipantRepository participantRepository;
    private final ResultRepository resultRepository;

    private Discipline Boxing;
    private Discipline Marathon;
    private Discipline Longjump;

    private Participant Alice;
    private Participant Bob;
    private Participant Emma;
    private Participant Tom;
    private Participant Lucy;
    private Participant Jack;
    private Participant Jane;
    private Participant Paul;
    private Participant Sarah;
    private Participant John;
    private Participant Mary;
    private Participant Mark;



    public InitData(DisciplineRepository disciplineRepository, ParticipantRepository participantRepository, ResultRepository resultRepository) {
        this.disciplineRepository = disciplineRepository;
        this.participantRepository = participantRepository;
        this.resultRepository = resultRepository;
    }


    // Create participants
    private void createParticipants() {
        Alice = new Participant("Alice", ParticipantGenderEnum.Female, 6, "Athlete Club A");
        Bob = new Participant("Bob", ParticipantGenderEnum.Male, 8, "Athlete Club B");
        Emma = new Participant("Emma", ParticipantGenderEnum.Female, 10, "Athlete Club C");
        Tom = new Participant("Tom", ParticipantGenderEnum.Male, 12, "Athlete Club D");
        Lucy = new Participant("Lucy", ParticipantGenderEnum.Female, 14, "Athlete Club E");
        Jack = new Participant("Jack", ParticipantGenderEnum.Male, 22, "Athlete Club F");
        Jane = new Participant("Jane", ParticipantGenderEnum.Female, 23, "Athlete Club G");
        Paul = new Participant("Paul", ParticipantGenderEnum.Male, 40, "Athlete Club H");
        Sarah = new Participant("Sarah", ParticipantGenderEnum.Female, 41, "Athlete Club I");
        John = new Participant("John", ParticipantGenderEnum.Male, 59, "Athlete Club J");
        Mary = new Participant("Mary", ParticipantGenderEnum.Female, 8, "Athlete Club K");
        Mark = new Participant("Mark", ParticipantGenderEnum.Male, 12, "Athlete Club L");

        Alice.setAgeGroup(calculateAgeGroup(Alice.getAge()));
        Bob.setAgeGroup(calculateAgeGroup(Bob.getAge()));
        Emma.setAgeGroup(calculateAgeGroup(Emma.getAge()));
        Tom.setAgeGroup(calculateAgeGroup(Tom.getAge()));
        Lucy.setAgeGroup(calculateAgeGroup(Lucy.getAge()));
        Jack.setAgeGroup(calculateAgeGroup(Jack.getAge()));
        Jane.setAgeGroup(calculateAgeGroup(Jane.getAge()));
        Paul.setAgeGroup(calculateAgeGroup(Paul.getAge()));
        Sarah.setAgeGroup(calculateAgeGroup(Sarah.getAge()));
        John.setAgeGroup(calculateAgeGroup(John.getAge()));
        Mary.setAgeGroup(calculateAgeGroup(Mary.getAge()));
        Mark.setAgeGroup(calculateAgeGroup(Mark.getAge()));

        participantRepository.save(Alice);
        participantRepository.save(Bob);
        participantRepository.save(Emma);
        participantRepository.save(Tom);
        participantRepository.save(Lucy);
        participantRepository.save(Jack);
        participantRepository.save(Jane);
        participantRepository.save(Paul);
        participantRepository.save(Sarah);
        participantRepository.save(John);
        participantRepository.save(Mary);
        participantRepository.save(Mark);
    }


    // Crete disciplines
    private void createDisciplines() {
        // Adding participants to each discipline
        List<Participant> boxingParticipants = List.of(Alice, Bob, Emma, Tom, Lucy, Jack, Jane, Paul);
        List<Participant> marathonParticipants = List.of(Sarah, John, Mary, Mark, Alice, Bob, Emma, Tom);
        List<Participant> longjumpParticipants = List.of(Lucy, Jack, Jane, Paul, Sarah, John, Mary, Mark);

        // Initialize the disciplines with their respective participants
        Boxing = new Discipline(DisciplinNameEnum.Boxing, boxingParticipants);
        Marathon = new Discipline(DisciplinNameEnum.Marathon, marathonParticipants);
        Longjump = new Discipline(DisciplinNameEnum.Longjump, longjumpParticipants);

        // Save the disciplines to the repository
        disciplineRepository.save(Boxing);
        disciplineRepository.save(Marathon);
        disciplineRepository.save(Longjump);
    }


    // Create results
    private void createResults() {
        // Boxing Results
        resultRepository.save(new Result(ResultTypeEnum.Score, LocalDate.now(), 8, Alice, Boxing));
        resultRepository.save(new Result(ResultTypeEnum.Score, LocalDate.now(), 6, Bob, Boxing));
        resultRepository.save(new Result(ResultTypeEnum.Score, LocalDate.now(), 9, Emma, Boxing));
        resultRepository.save(new Result(ResultTypeEnum.Score, LocalDate.now(), 7, Tom, Boxing));
        resultRepository.save(new Result(ResultTypeEnum.Score, LocalDate.now(), 5, Lucy, Boxing));
        resultRepository.save(new Result(ResultTypeEnum.Score, LocalDate.now(), 6, Jack, Boxing));
        resultRepository.save(new Result(ResultTypeEnum.Score, LocalDate.now(), 8, Jane, Boxing));
        resultRepository.save(new Result(ResultTypeEnum.Score, LocalDate.now(), 7, Paul, Boxing));

        // Marathon Results (in milliseconds)
        resultRepository.save(new Result(ResultTypeEnum.Time, LocalDate.now(), 15432000, Sarah, Marathon));  // 15.432 seconds
        resultRepository.save(new Result(ResultTypeEnum.Time, LocalDate.now(), 17345000, John, Marathon));   // 17.345 seconds
        resultRepository.save(new Result(ResultTypeEnum.Time, LocalDate.now(), 18923000, Mary, Marathon));   // 18.923 seconds
        resultRepository.save(new Result(ResultTypeEnum.Time, LocalDate.now(), 20456000, Mark, Marathon));   // 20.456 seconds
        resultRepository.save(new Result(ResultTypeEnum.Time, LocalDate.now(), 16234000, Alice, Marathon));  // 16.234 seconds
        resultRepository.save(new Result(ResultTypeEnum.Time, LocalDate.now(), 19876000, Bob, Marathon));    // 19.876 seconds
        resultRepository.save(new Result(ResultTypeEnum.Time, LocalDate.now(), 22345000, Emma, Marathon));   // 22.345 seconds
        resultRepository.save(new Result(ResultTypeEnum.Time, LocalDate.now(), 24567000, Tom, Marathon));    // 24.567 seconds

        // Longjump Results (in centimeters)
        resultRepository.save(new Result(ResultTypeEnum.Distance, LocalDate.now(), 602, Lucy, Longjump));  // 6m 2cm
        resultRepository.save(new Result(ResultTypeEnum.Distance, LocalDate.now(), 721, Jack, Longjump));  // 7m 21cm
        resultRepository.save(new Result(ResultTypeEnum.Distance, LocalDate.now(), 654, Jane, Longjump));  // 6m 54cm
        resultRepository.save(new Result(ResultTypeEnum.Distance, LocalDate.now(), 789, Paul, Longjump));  // 7m 89cm
        resultRepository.save(new Result(ResultTypeEnum.Distance, LocalDate.now(), 632, Sarah, Longjump)); // 6m 32cm
        resultRepository.save(new Result(ResultTypeEnum.Distance, LocalDate.now(), 701, John, Longjump));  // 7m 1cm
        resultRepository.save(new Result(ResultTypeEnum.Distance, LocalDate.now(), 645, Mary, Longjump));  // 6m 45cm
        resultRepository.save(new Result(ResultTypeEnum.Distance, LocalDate.now(), 718, Mark, Longjump));  // 7m 18cm

    }

    private ParticipantAgeGroupEnum calculateAgeGroup(int age) {
        if (age >= 6 && age <= 9) {
            return ParticipantAgeGroupEnum.Children;
        } else if (age >= 10 && age <= 13) {
            return ParticipantAgeGroupEnum.Youth;
        } else if (age >= 14 && age <= 22) {
            return ParticipantAgeGroupEnum.Junior;
        } else if (age >= 23 && age <= 40) {
            return ParticipantAgeGroupEnum.Adult;
        } else if (age >= 41) {
            return ParticipantAgeGroupEnum.Senior;
        } else {
            throw new IllegalArgumentException("Age not within a valid range for any age group");
        }
    }

}
