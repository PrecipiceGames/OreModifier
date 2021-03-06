/**
 * This file is licensed under Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported (CC BY-NC-SA 3.0)
 * Copyright (C) 2012 PrecipiceGames.com <hackhalo2@precipicegames.com>
 *
 * You are free to:
 *     - Remix this work (adapt it to your needs under this license scope)
 *     - Share this work (copy, distrubute, and transmit it under this license scope)
 * Under the following Conditions:
 *     - You may not use this work for commercial purposes.
 *     - You must attribute the work in the manner specified by the author or licensor (but not in any way that
 *           suggests that they endorse you or your use of the work).
 *     -  If you alter, transform, or build upon this work, you may distribute the resulting work only under
 *           the same or similar license to this one.
 * With the understanding that:
 *     - Any of the above conditions can be waived if you get permission from the copyright holder. (See Note #1)
 *     - Where the work or any of its elements is in the public domain under applicable law, that status is in no
 *           way affected by the license. (See Note #2)
 *     - In no way are any of the following rights affected by the license:
 *         - Your fair dealing or fair use rights, or other applicable copyright exceptions and limitations; (See Note #3)
 *         - The author's moral rights; (See Note #4)
 *         - Rights other persons may have either in the work itself or in how the work is used, such as publicity
 *               or privacy rights. (See Note #5)
 *
 * Note #1: CC licenses anticipate that a licensor may want to waive compliance with a specific condition, such as attribution.
 * Note #2: A work is in the public domain when it is free for use by anyone for any purpose without restriction under copyright.
 * Note #3: All jurisdictions allow some limited uses of copyrighted material without permission. CC licenses do not affect the
 *       rights of users under those copyright limitations and exceptions, such as fair use and fair dealing where applicable.
 * Note #4: In addition to the right of licensors to request removal of their name from the work when used in a derivative or
 *       collective they don't like, copyright laws in most jurisdictions around the world (with the notable exception of the US
 *       except in very limited circumstances) grant creators "moral rights" which may provide some redress if a derivative work
 *       represents a "derogatory treatment" of the licensor's work.
 * Note #5: Publicity rights allow individuals to control how their voice, image or likeness is used for commercial purposes in
 *       public. If a CC-licensed work includes the voice or image of anyone other than the licensor, a user of the work may need
 *       to get permission from those individuals before using the work for commercial purposes.
 *
 * Please see http://creativecommons.org/licenses/by-nc-sa/3.0/ for more information.
 */
package com.precipicegames.utilities.misc;

/**
 * Helper Class for storing Chunk Int Pairs instead of entire chunks
 * @author hackhalo2
 */
public class ChunkSQL {
	
	private int x;
	private int z;
	private String worldName;
	
	public ChunkSQL(int x, int z, String worldName) {
		this.x = x;
		this.z = z;
		this.worldName = worldName;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getZ() {
		return this.z;
	}
	
	public String getWorldName() {
		return this.worldName;
	}

	@Override
	public int hashCode() {
		final int prime = 677;
		int result = 263;
		result = prime * result
				+ ((worldName == null) ? 0 : worldName.hashCode());
		result = prime * result + x;
		result = prime * result + z;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChunkSQL other = (ChunkSQL) obj;
		if (worldName == null) {
			if (other.worldName != null)
				return false;
		} else if (!worldName.equals(other.worldName))
			return false;
		if (x != other.x)
			return false;
		if (z != other.z)
			return false;
		return true;
	}
	
	

}
