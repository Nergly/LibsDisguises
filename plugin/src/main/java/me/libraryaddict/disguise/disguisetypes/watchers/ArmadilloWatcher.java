package me.libraryaddict.disguise.disguisetypes.watchers;

import com.github.retrooper.packetevents.protocol.entity.armadillo.ArmadilloState;
import me.libraryaddict.disguise.disguisetypes.Disguise;
import me.libraryaddict.disguise.disguisetypes.MetaIndex;

/**
 * Created by libraryaddict on 6/05/2019.
 */
public class ArmadilloWatcher extends AgeableWatcher {
    public ArmadilloWatcher(Disguise disguise) {
        super(disguise);
    }

    public ArmadilloState getState() {
        return getData(MetaIndex.ARMADILLO_STATE);
    }

    public void setState(ArmadilloState state) {
        setData(MetaIndex.ARMADILLO_STATE, state);
        sendData(MetaIndex.ARMADILLO_STATE);
    }
}
