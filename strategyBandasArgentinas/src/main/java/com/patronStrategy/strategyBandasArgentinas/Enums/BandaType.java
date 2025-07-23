
package com.patronStrategy.strategyBandasArgentinas.Enums;
/**
 *
 * @author Enzo Ibarra
 */
import com.patronStrategy.strategyBandasArgentinas.Service.*;

public enum BandaType {
    SODA_STEREO(new SodaStereoStrategy()),
    REDONDOS(new LosRedondosStrategy()),
    LA_RENGA(new LaRengaStrategy());

    private final IBandaStrategy strategy;

    BandaType(IBandaStrategy strategy) {
        this.strategy = strategy;
    }

    public IBandaStrategy getStrategy() {
        return strategy;
    }
}