package co.digitalBankCucumberPractice.automation.ui.Utilities;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class MockData {
    private FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-US"), new RandomService());

    public String generateRandomEmail() {
        String email = fakeValuesService.bothify(new Faker().name().fullName() + "####@email.com");
        return email;
    }

    public String generateRandomSSN() {
        String ssn = String.format("%09d", new Random().nextInt(1000000000));
        return ssn;
    }

    public Map<String, String> generateFirstAndLastName() {
        Map<String, String> firstAndLastNameMap = new HashMap<>();
        firstAndLastNameMap.put("firstName", new Faker().name().firstName());
        firstAndLastNameMap.put("lastName", new Faker().name().lastName());
        return firstAndLastNameMap;
    }
}
