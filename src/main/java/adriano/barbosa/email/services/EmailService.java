package adriano.barbosa.email.services;

import adriano.barbosa.email.models.EmailModel;
import adriano.barbosa.email.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    EmailRepository emailRepository;

    public void sendEmail(EmailModel emailModel) {
    }
}
