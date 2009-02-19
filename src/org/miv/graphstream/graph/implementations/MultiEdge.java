/*
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 59 Temple
 * Place - Suite 330, Boston, MA 02111-1307, USA.
 */

package org.miv.graphstream.graph.implementations;

import org.miv.util.SingletonException;

/**
 * Full implementation of {@link org.miv.graphstream.graph.Edge} that allows multiple edges
 * between two nodes.
 * 
 * @author Antoine Dutot
 */
public class MultiEdge extends DefaultEdge
{
// Constructors

	/**
	 * New edge between a source node and target node. If the directed argument
	 * is true the edge is directed from the source to the target. The edge
	 * registers itself into the nodes and the graph.
	 * @param tag The edge unique id.
	 * @param source The origin node of the edge.
	 * @param target The destination node of the edge.
	 * @param directed Is the order source to target important?.
	 * @throws IllegalArgumentException If the source and or the target are not
	 *         part of a graph or not part of the same graph.
	 * @throws SingletonException If the source or the target already reference
	 *         this edge or if an edge with the same id already exists.
	 */
	protected
	MultiEdge( String tag, DefaultNode source, DefaultNode target, boolean directed )
		throws IllegalStateException, SingletonException
	{
		super( tag, source, target, directed );
	}

	protected
	MultiEdge()
	{
		super();
	}
}