#import "HWPWebData.h"

@implementation HWPWebData

- (void)get:(CDVInvokedUrlCommand*)command
{
    
    NSString* myURLString = [[command arguments] objectAtIndex:0];
    NSURL *myURL = [NSURL URLWithString:myURLString];
    
    NSError *error = nil;
    NSString *myHTMLString = [NSString stringWithContentsOfURL:myURL encoding: NSUTF8StringEncoding error:&error];
    
    CDVPluginResult* result = nil;
    if (error != nil)
    {
        NSLog(@"Error : %@", error);
        NSString *str = [NSString stringWithFormat:@"%@%@",@"Error : %@", error];
        result = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR messageAsString:str];
    }
    else
    {
        NSLog(@"HTML : %@", myHTMLString);
        result = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:myHTMLString];
    }
    [self.commandDelegate sendPluginResult:result callbackId:command.callbackId];
}

@end
