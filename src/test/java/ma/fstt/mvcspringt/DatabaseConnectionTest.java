package ma.fstt.mvcspringt;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;
@DataJpaTest
@ActiveProfiles("test") // if you have a different profile for testing
public class DatabaseConnectionTest {

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testDatabaseConnection() {
        // Given: A simple query
        String query = "SELECT 1";

        // When: Query is executed
        Object result = entityManager.getEntityManager().createNativeQuery(query).getSingleResult();

        // Then: The result should be 1
        assertThat(result).isEqualTo(1);
    }
}