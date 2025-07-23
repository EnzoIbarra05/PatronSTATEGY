
package com.patronStrategy.strategyBandasArgentinas.Controller;

/**
 *
 * @author Enzo Ibarra
 */

import com.patronStrategy.strategyBandasArgentinas.Enums.BandaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bandas")
public class BandaController {

    @GetMapping("/{banda}")
    public String obtenerInfo(@PathVariable String banda) {
        try {
            BandaType bandaType = BandaType.valueOf(banda.toUpperCase());
            return bandaType.getStrategy().infoBanda();
        } catch (IllegalArgumentException e) {
            return "Banda no reconocida. Opciones válidas: SODA_STEREO, REDONDOS, LA_RENGA.";
        }
    }
}