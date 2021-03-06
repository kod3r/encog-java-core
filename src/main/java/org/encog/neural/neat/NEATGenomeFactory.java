/*
 * Encog(tm) Core v3.2 - Java Version
 * http://www.heatonresearch.com/encog/
 * https://github.com/encog/encog-java-core
 
 * Copyright 2008-2013 Heaton Research, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *   
 * For more information on Heaton Research copyrights, licenses 
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package org.encog.neural.neat;

import java.util.List;
import java.util.Random;

import org.encog.ml.ea.genome.GenomeFactory;
import org.encog.neural.neat.training.NEATGenome;
import org.encog.neural.neat.training.NEATLinkGene;
import org.encog.neural.neat.training.NEATNeuronGene;

/**
 * This interface defines additional methods defined to create NEAT genomes. It
 * is an extension to the non-NEAT specific GenomeFactory.
 * 
 * -----------------------------------------------------------------------------
 * http://www.cs.ucf.edu/~kstanley/
 * Encog's NEAT implementation was drawn from the following three Journal
 * Articles. For more complete BibTeX sources, see NEATNetwork.java.
 * 
 * Evolving Neural Networks Through Augmenting Topologies
 * 
 * Generating Large-Scale Neural Networks Through Discovering Geometric
 * Regularities
 * 
 * Automatic feature selection in neuroevolution
 */
public interface NEATGenomeFactory extends GenomeFactory {

	/**
	 * Create a NEAT genome from a list of links and neurons.
	 * 
	 * @param neurons
	 *            A list of neuron genes.
	 * @param links
	 *            A list of link genes.
	 * @param inputCount
	 *            The input count.
	 * @param outputCount
	 *            The output count.
	 * @return The newly factored NEATGenome.
	 */
	NEATGenome factor(List<NEATNeuronGene> neurons, List<NEATLinkGene> links,
			int inputCount, int outputCount);

	/**
	 * Create a new random NEAT genome.
	 * 
	 * @param rnd
	 *            A random number generator.
	 * @param pop
	 *            The NEAT population.
	 * @param inputCount
	 *            The input count.
	 * @param outputCount
	 *            The output count.
	 * @param connectionDensity
	 *            The connection density. Specify 1.0 for fully connected.
	 * @return The newly created NEAT genome.
	 */
	NEATGenome factor(Random rnd, NEATPopulation pop, int inputCount,
			int outputCount, double connectionDensity);
}
