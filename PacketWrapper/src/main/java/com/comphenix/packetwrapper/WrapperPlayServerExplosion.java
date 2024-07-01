/**
 * PacketWrapper - ProtocolLib wrappers for Minecraft packets
 * Copyright (C) dmulloy2 <http://dmulloy2.net>
 * Copyright (C) Kristian S. Strangeland
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.comphenix.packetwrapper;

import java.util.List;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.comphenix.protocol.wrappers.WrappedParticle;
import org.bukkit.Sound;

public class WrapperPlayServerExplosion extends AbstractPacket {
	public static final PacketType TYPE = PacketType.Play.Server.EXPLOSION;

	public WrapperPlayServerExplosion() {
		super(new PacketContainer(TYPE), TYPE);
		handle.getModifier().writeDefaults();
	}

	public WrapperPlayServerExplosion(PacketContainer packet) {
		super(packet, TYPE);
	}

	/**
	 * Retrieve X.
	 * 
	 * @return The current X
	 */
	public double getX() {
		return handle.getDoubles().read(0);
	}

	/**
	 * Set X.
	 * 
	 * @param value - new value.
	 */
	public void setX(double value) {
		handle.getDoubles().write(0, value);
	}

	/**
	 * Retrieve Y.
	 * 
	 * @return The current Y
	 */
	public double getY() {
		return handle.getDoubles().read(1);
	}

	/**
	 * Set Y.
	 * 
	 * @param value - new value.
	 */
	public void setY(double value) {
		handle.getDoubles().write(1, value);
	}

	/**
	 * Retrieve Z.
	 * 
	 * @return The current Z
	 */
	public double getZ() {
		return handle.getDoubles().read(2);
	}

	/**
	 * Set Z.
	 * 
	 * @param value - new value.
	 */
	public void setZ(double value) {
		handle.getDoubles().write(2, value);
	}

	/**
	 * Retrieve Radius.
	 * <p>
	 * Notes: currently unused in the client
	 * 
	 * @return The current Radius
	 */
	public float getRadius() {
		return handle.getFloat().read(0);
	}

	/**
	 * Set Radius.
	 * 
	 * @param value - new value.
	 */
	public void setRadius(float value) {
		handle.getFloat().write(0, value);
	}

	/**
	 * Retrieve Record count.
	 * <p>
	 * Notes: this is the count, not the size. The size is 3 times this value.
	 *
	 * @return The current Record count
	 */
	public List<BlockPosition> getRecords() {
		return handle.getBlockPositionCollectionModifier().read(0);
	}

	/**
	 * Retrieve Record count.
	 * <p>
	 * Notes: this is the count, not the size. The size is 3 times this value.
	 * 
	 * @return The current Record count
	 * @see #getRecords()
	 * @deprecated Misspelled.
	 */
	@Deprecated
	public List<BlockPosition> getRecors() {
		return handle.getBlockPositionCollectionModifier().read(0);
	}

	/**
	 * Set Record count.
	 * 
	 * @param value - new value.
	 */
	public void setRecords(List<BlockPosition> value) {
		handle.getBlockPositionCollectionModifier().write(0, value);
	}

	/**
	 * Retrieve the X velocity of the player being pushed by the explosion.
	 *
	 * @return The current X velocity.
	 */
	public float getPlayerVelocityX() {
		return handle.getFloat().read(1);
	}

	/**
	 * Set the X velocity of the player being pushed by the explosion.
	 *
	 * @param value - new X velocity.
	 */
	public void setPlayerVelocityX(float value) {
		handle.getFloat().write(1, value);
	}

	/**
	 * Retrieve the Y velocity of the player being pushed by the explosion.
	 *
	 * @return The current Y velocity.
	 */
	public float getPlayerVelocityY() {
		return handle.getFloat().read(2);
	}

	/**
	 * Set the Y velocity of the player being pushed by the explosion.
	 *
	 * @param value - new Y velocity.
	 */
	public void setPlayerVelocityY(float value) {
		handle.getFloat().write(2, value);
	}

	/**
	 * Retrieve the Z velocity of the player being pushed by the explosion.
	 *
	 * @return The current Z velocity.
	 */
	public float getPlayerVelocityZ() {
		return handle.getFloat().read(3);
	}

	/**
	 * Set the Z velocity of the player being pushed by the explosion.
	 *
	 * @param value - new Z velocity.
	 */
	public void setPlayerVelocityZ(float value) {
		handle.getFloat().write(3, value);
	}

	/**
	 * Retrieve the small explosion particle ID.
	 * <p>
	 * This is for Minecraft R1.20+
	 *
	 * @return The current small explosion particle ID.
	 */
	public EnumWrappers.Particle getSmallExplosionParticleId() {
		return handle.getParticles().read(8);
	}

	/**
	 * Set the small explosion particle ID.
	 * <p>
	 * This is for Minecraft R1.20+
	 *
	 * @param value - new small explosion particle ID.
	 */
	public void setSmallExplosionParticleId(EnumWrappers.Particle value) {
		handle.getParticles().write(8, value);
	}

	/**
	 * Retrieve the small explosion particle data.
	 * <p>
	 * This is for Minecraft R1.20+
	 *
	 * @return The current small explosion particle data.
	 */
	public WrappedParticle<?> getSmallExplosionParticle() {
		return handle.getNewParticles().read(0);
	}

	/**
	 * Set the small explosion particle data.
	 * <p>
	 * This is for Minecraft R1.20+
	 *
	 * @param value - new small explosion particle data.
	 */
	public void setSmallExplosionParticle(WrappedParticle<?> value) {
		handle.getNewParticles().write(0, value);
	}

	/**
	 * Retrieve the large explosion particle ID.
	 * <p>
	 * This is for Minecraft R1.20+
	 *
	 * @return The current large explosion particle ID.
	 */
	public EnumWrappers.Particle getLargeExplosionParticleId() {
		return handle.getParticles().read(9);
	}

	/**
	 * Set the large explosion particle ID.
	 * <p>
	 * This is for Minecraft R1.20+
	 *
	 * @param value - new large explosion particle ID.
	 */
	public void setLargeExplosionParticleId(EnumWrappers.Particle value) {
		handle.getParticles().write(9, value);
	}

	/**
	 * Retrieve the large explosion particle data.
	 * <p>
	 * This is for Minecraft R1.20+
	 *
	 * @return The current large explosion particle data.
	 */
	public WrappedParticle<?> getLargeExplosionParticle() {
		return handle.getNewParticles().read(1);
	}

	/**
	 * Set the large explosion particle data.
	 * <p>
	 * This is for Minecraft R1.20+
	 *
	 * @param value - new large explosion particle data.
	 */
	public void setLargeExplosionParticle(WrappedParticle<?> value) {
		handle.getNewParticles().write(1, value);
	}

	/**
	 * Retrieve the sound effect of the explosion.
	 * <p>
	 * This is for Minecraft R1.20+
	 *
	 * @return The current sound effect.
	 */
	public Sound getSound() {
		return handle.getSoundEffects().read(0);
	}

	/**
	 * Set the sound effect of the explosion.
	 * <p>
	 * This is for Minecraft R1.20+
	 *
	 * @param value - new sound effect.
	 */
	public void setSound(Sound value) {
		handle.getSoundEffects().write(0, value);
	}

	/**
	 * Set the block interaction type.
	 * <p>
	 * This is for Minecraft R1.20+
	 *
	 * @param value - new block interaction effect.
	 * @throws IllegalArgumentException when the provided value is not of {@link net.minecraft.world.level.Explosion$Effect}
	 * @throws ClassNotFoundException when called with an incompatible Minecraft version
	 */
	@SuppressWarnings({"unchecked", "rawtypes"})
	public void setBlockInteraction(Enum<?> value) throws ClassNotFoundException {
		Class<?> enumClass = Class.forName("net.minecraft.world.level.Explosion$Effect");
		if (!enumClass.isInstance(value)) {
			throw new IllegalArgumentException("Invalid enum type: " + value.getDeclaringClass().getName()
					+ ". Required type: net.minecraft.world.level.Explosion$Effect");
		}
		handle.getEnumModifier((Class<Enum>) enumClass, 10).write(0, value);
	}


	/**
	 * Retrieve the block interaction type.
	 * <p>
	 * This is for Minecraft R1.20+
	 *
	 * @return The current block interaction effect.
	 * @throws ClassNotFoundException when called with an incompatible Minecraft version
	 */
	@SuppressWarnings({"unchecked", "rawtypes"})
	public Enum<?> getBlockInteraction() throws ClassNotFoundException {
		Class<?> enumClass = Class.forName("net.minecraft.world.level.Explosion$Effect");
		return (Enum<?>) handle.getEnumModifier((Class<Enum>) enumClass, 10).read(0);
	}
}
