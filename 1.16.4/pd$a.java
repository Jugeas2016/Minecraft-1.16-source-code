/*     */ import com.mojang.brigadier.builder.ArgumentBuilder;
/*     */ import com.mojang.brigadier.context.CommandContext;
/*     */ import com.mojang.brigadier.exceptions.CommandSyntaxException;
/*     */ import com.mojang.brigadier.tree.CommandNode;
/*     */ import com.mojang.brigadier.tree.RootCommandNode;
/*     */ import javax.annotation.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class a
/*     */ {
/*     */   @Nullable
/*     */   private final ArgumentBuilder<dd, ?> a;
/*     */   private final byte b;
/*     */   private final int c;
/*     */   private final int[] d;
/*     */   @Nullable
/*     */   private CommandNode<dd> e;
/*     */   
/*     */   private a(@Nullable ArgumentBuilder<dd, ?> ☃, byte b, int i, int[] arrayOfInt) {
/* 205 */     this.a = ☃;
/* 206 */     this.b = b;
/* 207 */     this.c = i;
/* 208 */     this.d = arrayOfInt;
/*     */   }
/*     */   
/*     */   public boolean a(a[] ☃) {
/* 212 */     if (this.e == null) {
/* 213 */       if (this.a == null) {
/* 214 */         this.e = (CommandNode<dd>)new RootCommandNode();
/*     */       } else {
/* 216 */         if ((this.b & 0x8) != 0) {
/* 217 */           if ((☃[this.c]).e == null) {
/* 218 */             return false;
/*     */           }
/* 220 */           this.a.redirect((☃[this.c]).e);
/*     */         } 
/*     */         
/* 223 */         if ((this.b & 0x4) != 0) {
/* 224 */           this.a.executes(☃ -> 0);
/*     */         }
/*     */         
/* 227 */         this.e = this.a.build();
/*     */       } 
/*     */     }
/*     */     
/* 231 */     for (int i : this.d) {
/* 232 */       if ((☃[i]).e == null) {
/* 233 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 237 */     for (int i : this.d) {
/* 238 */       CommandNode<dd> commandNode = (☃[i]).e;
/* 239 */       if (!(commandNode instanceof RootCommandNode)) {
/* 240 */         this.e.addChild(commandNode);
/*     */       }
/*     */     } 
/*     */     
/* 244 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Georg\OneDrive\Minecraft\Desktop\Minecraft\1.16.4.zip!\pd$a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */