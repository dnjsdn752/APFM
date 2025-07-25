package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class InspectionHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Inspection>> {

    @Override
    public EntityModel<Inspection> process(EntityModel<Inspection> model) {
        return model;
    }
}
