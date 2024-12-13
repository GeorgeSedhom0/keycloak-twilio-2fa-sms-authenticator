# Keycloak 2FA SMS Authenticator

Keycloak Authentication Provider implementation to get a 2nd-factor authentication with a OTP/code/token send via SMS (through Twilio).

_Demo purposes only!_

Unfortunately, I don't have a real readme yet.
Blame on me!

But, for now, you can at least read my **blog post** about this autenticator here:  
https://www.n-k.de/2020/12/keycloak-2fa-sms-authentication.html

Or, just watch my **video** about this 2FA SMS SPI:

[![](http://img.youtube.com/vi/GQi19817fFk/maxresdefault.jpg)](http://www.youtube.com/watch?v=GQi19817fFk "")

[![](http://img.youtube.com/vi/FHJ5WOx1es0/maxresdefault.jpg)](http://www.youtube.com/watch?v=FHJ5WOx1es0 "")

## Twilio Configuration

To use Twilio for sending SMS, you need to configure your Twilio account SID, auth token, and the phone number you want to send messages from.

1. Sign up for a Twilio account at https://www.twilio.com/ and get your Account SID and Auth Token.
2. In the Keycloak admin console, go to the Authentication section and select the "SMS Authentication" flow.
3. Edit the configuration of the "SMS Authentication" flow and add the following configuration properties:
   - `twilioAccountSid`: Your Twilio Account SID
   - `twilioAuthToken`: Your Twilio Auth Token
   - `twilioFromPhoneNumber`: The phone number you want to send messages from (must be a verified Twilio number)
