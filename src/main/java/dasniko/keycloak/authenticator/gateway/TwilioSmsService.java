package dasniko.keycloak.authenticator.gateway;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.util.Map;

public class TwilioSmsService implements SmsService {

    private final String fromPhoneNumber;

    public TwilioSmsService(Map<String, String> config) {
        String accountSid = config.get("twilioAccountSid");
        String authToken = config.get("twilioAuthToken");
        fromPhoneNumber = config.get("twilioFromPhoneNumber");
        Twilio.init(accountSid, authToken);
    }

    @Override
    public void send(String phoneNumber, String message) {
        Message.creator(
                new PhoneNumber(phoneNumber),
                new PhoneNumber(fromPhoneNumber),
                message
        ).create();
    }
}
