package genepi.minicloudmac.hadoop.preprocessing.vcf;

import genepi.io.FileUtil;
import cloudgene.mapred.jobs.CloudgeneContext;
import cloudgene.mapred.jobs.CloudgeneStep;
import cloudgene.mapred.jobs.Message;
import cloudgene.mapred.wdl.WdlStep;

public class FilePrinter extends CloudgeneStep {

	@Override
	public boolean run(WdlStep step, CloudgeneContext context) {

		String input = context.get("qcstat");

		String content = FileUtil.readFileAsString(input);

		message(content, Message.OK);

		return true;
	}

}
