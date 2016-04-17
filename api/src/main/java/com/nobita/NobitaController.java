package com.nobita;

import com.nobita.domain.Shift;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * API Controller.
 */
@RestController
public class NobitaController {

    @RequestMapping(value = "/v1/api/shifts", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void postShift(@Valid @RequestBody List<Shift> shifts, BindingResult result) {

    }

}
