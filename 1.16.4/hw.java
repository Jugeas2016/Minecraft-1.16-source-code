/*    */ import com.google.gson.Gson;
/*    */ import com.google.gson.GsonBuilder;
/*    */ import com.google.gson.JsonElement;
/*    */ import com.mojang.brigadier.CommandDispatcher;
/*    */ import com.mojang.brigadier.tree.CommandNode;
/*    */ import java.io.IOException;
/*    */ import java.nio.file.Path;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hw
/*    */   implements hm
/*    */ {
/* 17 */   private static final Gson b = (new GsonBuilder()).setPrettyPrinting().disableHtmlEscaping().create();
/*    */   private final hl c;
/*    */   
/*    */   public hw(hl ☃) {
/* 21 */     this.c = ☃;
/*    */   }
/*    */ 
/*    */   
/*    */   public void a(hn ☃) throws IOException {
/* 26 */     Path path = this.c.b().resolve("reports/commands.json");
/* 27 */     CommandDispatcher<db> commandDispatcher = (new dc(dc.a.a)).a();
/* 28 */     hm.a(b, ☃, (JsonElement)fk.a(commandDispatcher, (CommandNode<db>)commandDispatcher.getRoot()), path);
/*    */   }
/*    */ 
/*    */   
/*    */   public String a() {
/* 33 */     return "Command Syntax";
/*    */   }
/*    */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\hw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */