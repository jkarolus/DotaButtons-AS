package de.jakobkarolus.dotabuttons.io;

import java.util.List;
import java.util.Map;

import de.jakobkarolus.dotabuttons.model.HeroResponse;
import de.jakobkarolus.dotabuttons.model.Heroes;

/**
 * Created by Jakob on 01.03.2015.
 */
public interface DotaButtonsDbCallback {

    public void onAddHeroResponseError(HeroResponse response);

    public void onRemoveHeroResponseError(HeroResponse response);

    public void onRetrieveFavorites(Map<Heroes, List<HeroResponse>> responses);
}
