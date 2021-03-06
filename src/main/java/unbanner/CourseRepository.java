package unbanner;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface CourseRepository extends MongoRepository<Course, String> {
  public Course findById(String id);

  public List<Course> findByDepartment(String department);

  public List<Course> findByCredits(int credits);

  public Course findByName(String name);

}
