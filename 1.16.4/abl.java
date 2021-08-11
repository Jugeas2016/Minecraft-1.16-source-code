/*   */ import java.io.File;
/*   */ import java.io.FileNotFoundException;
/*   */ 
/*   */ public class abl
/*   */   extends FileNotFoundException
/*   */ {
/*   */   public abl(File ☃, String str) {
/* 8 */     super(String.format("'%s' in ResourcePack '%s'", new Object[] { str, ☃ }));
/*   */   }
/*   */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\abl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */