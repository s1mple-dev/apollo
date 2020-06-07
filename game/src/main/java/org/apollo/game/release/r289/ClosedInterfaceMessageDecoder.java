package org.apollo.game.release.r289;

import org.apollo.game.message.impl.ClosedInterfaceMessage;
import org.apollo.net.codec.game.GamePacket;
import org.apollo.net.release.MessageDecoder;

public final class ClosedInterfaceMessageDecoder extends MessageDecoder<ClosedInterfaceMessage> {

	@Override
	public ClosedInterfaceMessage decode(GamePacket packet) {
		return new ClosedInterfaceMessage();
	}

}